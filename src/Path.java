import java.util.ArrayList;
import java.util.Arrays;

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
        ArrayList<String> splittedPath = new ArrayList<>(Arrays.asList(this.path.split("/")));
        ArrayList<String> splittedNewPath = new ArrayList<>(Arrays.asList(newPath.split("/")));
        int back = 0;
        for (int i = 0; i < splittedNewPath.size(); i++) {
            if (splittedNewPath.get(0).equals("..")) {
                back += 1;
                splittedNewPath.remove(0);
            } else {
                break;
            }
        }
        int length = splittedPath.size();
        if (back != 0) {
            for (int i = length - 1; i >= length - back; i--) {
                splittedPath.remove(i);
            }
        }
        this.path = String.join("/", String.join("/", splittedPath), String.join("/", splittedNewPath));

    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../../x");
        System.out.println(path.getPath());
    }
}