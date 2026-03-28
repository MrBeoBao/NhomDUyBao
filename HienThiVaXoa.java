public static void showTasks() {
    System.out.println("\n--- Danh sach nhiem vu ---");
    if (tasks.isEmpty()) {
        System.out.println("Chua co du lieu.");
    } else {
        for (String t : tasks) {
            System.out.println("- " + t);
        }
    }
}

public static void deleteTask(){
    System.out.print("Nhap ten cong viec can xoa: ");
    String task = scanner.nextLine();
    if (tasks.remove(task)) {
        System.out.println("=> Da xoa thanh cong!");
    } else {
        System.out.println("=> Cong viec khong ton tai!");
    }
}