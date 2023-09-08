package StructureClass.compositePattern;

public class Client {
    public static void main(String[] args) {
        // 创建文件和文件夹
        Myfile file1 = new Leaf("file1.txt");
        Myfile file2 = new Leaf("file2.doc");

        Branch folder1 = new Branch("Folder 1");
        Branch folder2 = new Branch("Folder 2");

        // 组合文件和文件夹
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder1.addComponent(folder2);

        // 显示文件系统结构
        folder1.showInfo();
    }
}
