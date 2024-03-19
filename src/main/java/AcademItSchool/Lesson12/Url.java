package AcademItSchool.Lesson12;

public class Url {
    public static String getServerName(String url) {
        int substringIndex = url.indexOf("://");

        if (substringIndex == -1) {
            return null;
        }

        int startIndex = substringIndex + 3;

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
