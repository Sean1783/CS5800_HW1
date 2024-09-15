import com.filesystem.folder.Folder;

public class Main {
    public static void main(String[] args) {

        Folder php_demo1 = new Folder("php_demo1");

//        php_demo1.createSubFolder("Source Files");
//        php_demo1.createSubFolder("Include Path");
//        php_demo1.createSubFolder("Remote Files");

//        php_demo1.dummyCreate("Source Files");
//        php_demo1.dummyCreate("Include Path");
//        php_demo1.dummyCreate("Remote Files");

        php_demo1.createSubFolder("Source Files");
        php_demo1.createSubFolder("Include Path");
        php_demo1.createSubFolder("Remote Files");
        php_demo1.createSubFolder("Source Files/app");
        php_demo1.createSubFolder("Source Files/app/config");
        php_demo1.createSubFolder("Source Files/app/controllers");
        php_demo1.createSubFolder("Source Files/app/library");
        php_demo1.createSubFolder("Source Files/app/migrations");
        php_demo1.createSubFolder("Source Files/app/models");
        php_demo1.createSubFolder("Source Files/app/views");
        php_demo1.createSubFolder("Source Files/.phalcon");
        php_demo1.createSubFolder("Source Files/public");
        php_demo1.createSubFolder("Source Files/cache");
        php_demo1.createSubFolder("Source Files/public");

        php_demo1.addFile("Source Files/public", ".htaccess");
        php_demo1.addFile("Source Files/public", ".htrouter.php");
        php_demo1.addFile("Source Files/public", "index.html");
        php_demo1.print(0);

        php_demo1.deleteThisSubFolder("Source Files/app");
        php_demo1.print(0);

        php_demo1.deleteThisSubFolder("Source Files/public");
        php_demo1.print(0);


        // Folder f = php_demo1.getThisSubFolder("Source Files/.phalcon");
//        System.out.println(f.toString());
//        f.dummyCreateFolder("test folder");
        php_demo1.dummyCreateFolder("Source Files/.phalcon/test folder");
//        php_demo1.print(0);
        Folder f = php_demo1.dummy("Source Files/.phalcon");
        System.out.println(f.toString());

//        // Create immediate subfolders of "php_demo1/Source Files" folder.
//        php_demo1.getSubFolder("Source Files")
//                .createSubFolder("app");
//        php_demo1.getSubFolder("Source Files")
//                .createSubFolder(".phalcon");
//        php_demo1.getSubFolder("Source Files")
//                .createSubFolder(".phalcon");
//        php_demo1.getSubFolder("Source Files")
//                .createSubFolder("public");
//        php_demo1.getSubFolder("Source Files")
//                .createSubFolder("cache");
//
//        // Create immediate subfolders of "php_demo1/Source Files/app" folder.
//        php_demo1.getSubFolder("Source Files")
//                .getSubFolder("app")
//                    .createSubFolder("config");
//        php_demo1.getSubFolder("Source Files")
//                .getSubFolder("app")
//                    .createSubFolder("controllers");
//        php_demo1.getSubFolder("Source Files")
//                .getSubFolder("app")
//                    .createSubFolder("library");
//        php_demo1.getSubFolder("Source Files")
//                .getSubFolder("app")
//                    .createSubFolder("migrations");
//        php_demo1.getSubFolder("Source Files")
//                .getSubFolder("app")
//                    .createSubFolder("models");
//        php_demo1.getSubFolder("Source Files")
//                .getSubFolder("app")
//                    .createSubFolder("views");
//
//        // Add files to "php_demo1/Source Files/public"
//        php_demo1.getSubFolder("Source Files")
//                .getSubFolder("public")
//                    .addFile("index.html");
//        php_demo1.getSubFolder("Source Files")
//                .getSubFolder("public")
//                        .addFile(".htaccess");
//        php_demo1.getSubFolder("Source Files")
//                .getSubFolder("public")
//                        .addFile(".htrouter.php");
//
//        php_demo1.print(0);
//
//        // Delete "php_demo1/Source Files/app"
//        php_demo1.getSubFolder("Source Files")
//                .deleteSubFolder("app");
//
//        php_demo1.print(0);
//
//        // Delete "php_demo1/Source Files/public"
//        php_demo1.getSubFolder("Source Files")
//                .deleteSubFolder("public");
//
//        php_demo1.print(0);

    }
}