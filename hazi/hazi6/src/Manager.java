public class Manager {
    private Namer namer;
    private Folder imagesFolder;
    private Folder etcFolder;

    public Manager(Namer namer, Folder rootFolder) {
        this.namer = namer;

        this.imagesFolder = new Folder(rootFolder, "images");
        this.etcFolder = new Folder(rootFolder, "etc");
    }

    public File upload(String fileName, long size) {
        if (fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".gif")) {
            File uj = new File(imagesFolder, fileName, size);
            namer.rename(uj);

            System.out.println("Stored " + fileName + " at " + uj.fullPath());
            System.out.println("Images size: " + imagesFolder.size() + " bytes");
            System.out.println("Etc size: " + etcFolder.size() + " bytes");
            return uj;
        } else {
            File uj = new File(etcFolder, fileName, size);
            namer.rename(uj);

            System.out.println("Stored " + fileName + " at " + uj.fullPath());
            System.out.println("Images size: " + imagesFolder.size() + " bytes");
            System.out.println("Etc size: " + etcFolder.size() + " bytes");
            return uj;
        }
    }
}
