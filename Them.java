public static void addTask() {
    System.out.print("Nhap ten cong viec: ");
    String task = scanner.nextLine();
    tasks.add(task);
    System.out.println("=> Da luu thanh cong!");
}