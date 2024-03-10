package AcademItSchool.Lesson12;

public class URL {
    public static String getServerName(String url) {
        int startIndex = url.indexOf("://");

        if (startIndex == -1) {
            return null;
        }

        startIndex += 3;

        int endIndex = url.indexOf("/", startIndex);

        if (endIndex == -1) {
            return url.substring(startIndex);
        }

        return url.substring(startIndex, endIndex);

    }

    public static void main(String[] args) {
        String url = "http://someservername/abcd/dfdf.htm?dfdf=dfdf";

        System.out.println("Имя сервера: " + getServerName(url));
    }
}
