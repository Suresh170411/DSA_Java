import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateFilesSystem {
    public static void main(String[] args) {

        String arr [] = {"Goa","Kolkata","Pune","Bhubaneswar"};

        List<List<String>> list = findDuplicate(arr);

       System.out.println(list);
    }

    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<>();
        Map<String, Set<String>> hm = new HashMap<>();

        for (String path : paths) {
            String[] content = path.split("\\s");

            for (int i = 1; i < content.length; i++) {
                int fileContentIdx = content[i].indexOf("(");
                String fileContent = content[i].substring(fileContentIdx);
                String fullPath = content[0] + "/" + content[i].substring(0, fileContentIdx);

                hm.putIfAbsent(fileContent, new HashSet<>());
                hm.get(fileContent).add(fullPath);
            }
        }

        for (String key : hm.keySet()) {
            if (hm.get(key).size() > 1) {
                List<String> temp = new ArrayList<>();
                Set<String> duplicateFiles = hm.get(key);

                for (String file : duplicateFiles) {
                    temp.add(file);
                }

                result.add(temp);
            }
        }

        return result;
    }
}
