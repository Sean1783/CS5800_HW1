import com.filesystem.folder.Folder;

public class Main {
    public static void main(String[] args) {

        Folder php_demo1 = new Folder("php_demo1");

        php_demo1.makeSubFolder("Source Files");
        php_demo1.makeSubFolder("Include Path");
        php_demo1.makeSubFolder("Remote Files");
        php_demo1.makeSubFolder("Source Files/app");
        php_demo1.makeSubFolder("Source Files/app/config");
        php_demo1.makeSubFolder("Source Files/app/controllers");
        php_demo1.makeSubFolder("Source Files/app/library");
        php_demo1.makeSubFolder("Source Files/app/migrations");
        php_demo1.makeSubFolder("Source Files/app/models");
        php_demo1.makeSubFolder("Source Files/app/views");
        php_demo1.makeSubFolder("Source Files/.phalcon");
        php_demo1.makeSubFolder("Source Files/public");
        php_demo1.makeSubFolder("Source Files/cache");
        php_demo1.makeSubFolder("Source Files/public");

        php_demo1.addFile("Source Files/public", ".htaccess");
        php_demo1.addFile("Source Files/public", ".htrouter.php");
        php_demo1.addFile("Source Files/public", "index.html");
        php_demo1.print(0);

        php_demo1.deleteThisSubFolder("Source Files/app");
        php_demo1.print(0);

        php_demo1.deleteThisSubFolder("Source Files/public");
        php_demo1.print(0);

    }
}