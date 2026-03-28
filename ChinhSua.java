public static void editTask() {
    System.out.print("Nhap ten cong viec can chinh sua: ");
    String oldTask = scanner.nextLine();
    if (tasks.contains(oldTask)) {
        System.out.print("Nhap ten cong viec moi: ");
        String newTask = scanner.nextLine();
        int index = tasks.indexOf(oldTask);
        tasks.set(index, newTask);
        System.out.println("=> Da chinh sua thanh cong!");
    } else {
        System.out.println("=> Cong viec khong ton tai!");
    }
}