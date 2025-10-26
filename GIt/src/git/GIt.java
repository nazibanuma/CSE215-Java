
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;

class GitHub {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java GitHubStreaks <username>");
            return;
        }
        String username = args[0];
        String url = "https://github.com/users/" + username + "/contributions";
        String html = fetch(url);

        // Regex to extract date & count
        Pattern p = Pattern.compile("data-date=\"(\\d{4}-\\d{2}-\\d{2})\" data-count=\"(\\d+)\"");
        Matcher m = p.matcher(html);

        TreeMap<String, Integer> map = new TreeMap<>();
        while (m.find()) {
            map.put(m.group(1), Integer.parseInt(m.group(2)));
        }

        int longest = 0, current = 0, streak = 0;
        List<String> dates = new ArrayList<>(map.keySet());
        for (String d : dates) {
            if (map.get(d) > 0) {
                streak++;
                longest = Math.max(longest, streak);
            } else {
                streak = 0;
            }
        }

        // Count current streak backwards
        for (int i = dates.size() - 1; i >= 0 && map.get(dates.get(i)) > 0; i--) {
            current++;
        }

        System.out.println("Current streak: " + current + " day(s)");
        System.out.println("Longest streak: " + longest + " day(s)");
    }

    static String fetch(String urlStr) throws Exception {
        URL url = new URL(urlStr);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder sb = new StringBuilder();
        for (String line; (line = in.readLine()) != null;) {
            sb.append(line);
        }
        in.close();
        return sb.toString();
    }
}
