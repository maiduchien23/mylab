
import java.util.*;


public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0;
        PhoneBook objmain=new PhoneBook();
        while(i==0)
        {
            System.out.println("Menu\n1.Thêm liên lạc\n2.Hiển thị tất cả các địa chỉ liên lạc\n3.Tìm kiếm liên hệ qua số điện thoại\n4.Xóa liên hệ\n5.Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            int n=Integer.parseInt(sc.nextLine());
            if(n==1)
            {
                Contact obj=new Contact();
                System.out.println("Thêm liên lạc: ");
                System.out.println("Nhập tên của bạn: ");
                obj.setFirstName(sc.nextLine());
                System.out.println("Nhập họ của bạn: ");
                obj.setLastName(sc.nextLine());
                System.out.println("Nhập số điện thoại. : ");
                obj.setPhoneNumber(Long.parseLong(sc.nextLine()));
                System.out.println("Nhập Email: ");
                obj.setEmailId(sc.nextLine());
                objmain.addContact(obj);
            }
            if(n==2)
            {
                System.out.println("Các liên hệ trong Danh sách là::");
                List<Contact>obj=objmain.viewAllContacts();
                for(Contact temp:obj)
                {
                    System.out.println("Tên:"+temp.getFirstName());
                    System.out.println("Họ:"+temp.getLastName());
                    System.out.println("Số điện thoại:"+temp.getPhoneNumber());
                    System.out.println("Email:"+temp.getEmailId());
                }
            }
            if(n==3)
            {
                System.out.println("Nhập Số điện thoại cần tìm liên hệ:");
                Long n1=Long.parseLong(sc.nextLine());
                Contact obj1=objmain.viewContactGivenPhone(n1);
                System.out.println("Liên lạc là:");
                System.out.println("Tên:"+obj1.getFirstName());
                System.out.println("Họ:"+obj1.getLastName());
                System.out.println("Số điện thoại:"+obj1.getPhoneNumber());
                System.out.println("Email:"+obj1.getEmailId());
            }
            if(n==4)
            {
                System.out.println("Nhập Số điện thoại cần xoá:");
                Long n1=Long.parseLong(sc.nextLine());
                System.out.println("Bạn có chắc muốn xóa không ?(Y/N):");
                char ch=sc.nextLine().charAt(0);
                if (ch == 'Y') {
                } else {
                    boolean f1=objmain.removeContact(n1);
                    if(f1)
                        System.out.println("Đã xóa liên hệ thành công");
                    else
                        System.out.println("Không tìm thấy liên hệ");
                }
                if(ch == 'N')
                {
                    System.out.println("ok");
                }

            }
            if(n==5)
            {
                System.exit(0);
            }
        }
    }
}

