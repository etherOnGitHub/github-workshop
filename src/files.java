import java.io.File;

void main() {
    // declare instances of file doesn't create files
    // paths with folders must create the folder first
    // if not it won't run
    File file = new File("data", "nested.txt");
    File file2 = new File("example.txt");
    File dir = new File("logs");

    IO.println(file.getPath());
    IO.println(file2.getParent());
    IO.println(dir.getAbsolutePath());
    IO.println(file.isAbsolute());

    IO.print("Write String: ");
    String str = IO.readln();

    try {
        writeToFile(file2, str);
        createFile(file2);
        ArrayList<String> content = readFromFile(file2);
        IO.println(content);
        deleteFile(file2);
    } catch (IOException e) {
        IO.println("Error: " + e.getMessage());
    }
}

void createFile(File file) throws IOException {
    boolean exists = file.createNewFile();
    IO.println(exists);
}

void writeToFile(File file, String str) throws IOException {
    try (FileWriter fw = new FileWriter(file, true)) {
        fw.write(str);
    } catch (IOException e) {
        IO.println("Error: " + e.getMessage());
    }

}

ArrayList<String> readFromFile(File file) throws IOException {
    ArrayList<String> content = new ArrayList<>();
    try {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null) {
            IO.println(str);
            content.add(str);
        }
        br.close();
    } catch (IOException e) {
        IO.println("Error: " + e.getMessage());
    }
    return content;
}

void deleteFile(File file) throws IOException {
    IO.println("Confirm Deletion (y/n): ");
    String str = IO.readln();
    str = str.trim().toLowerCase();
    if (str.equalsIgnoreCase("y")) {
        try {
            boolean deleted = file.delete();
            IO.println(deleted);
        } catch (Exception e) {
            IO.println("Error: " + e.getMessage());
        }
    }
    else if (str.equalsIgnoreCase("n")) {
        IO.println("Delete Cancelled");
    }
}
