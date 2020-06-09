package optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        User user = new User("LiJun", "123456", new Address("YN", "KM", "CG"));
        User userNull = new User("LiJun", "123456");
        User nullUser = null;
        System.out.println("get user province:" + getUserProvinceJava8(nullUser));
//        System.out.println("get null user province:" + getUserProvinceJava8(null));

        System.out.println("empty() user:"+getEmptyUser(user));
        System.out.println("of() user:"+ getOfUser(user));
//        System.out.println("of() user:"+ getOfUser(nullUser));//会报nullPointerException
        System.out.println("ofNullable user:"+getOfNullableUser(user));
//        System.out.println("ofNullable user:"+getOfNullableUser(nullUser));//不会报nullPointerException

        //使用
        User userOne = new User("LiJun", "123456", new Address("YN", "KM", "CG"));
        User userTwo = new User();
        try {
            System.out.println("get user name:"+getUserName(userOne));
        } catch (Exception e) {
            System.out.println("user name is null.");
            e.printStackTrace();
        }
        try {
//            System.out.println("get user name:"+getUserName(userTwo));
        } catch (Exception e) {
            System.out.println("user name is null.");
            e.printStackTrace();
        }

    }

    //before java 8
    public static String getUserProvince(User user) {
        if (user != null) {
            Address address = user.getAddress();
            if (address != null) {
                return address.getProvince();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    //java 8
    public static String getUserProvinceJava8(User user) {
        return Optional.ofNullable(user).map(u -> u.getAddress()).map(address -> address.getProvince()).get();
//        if(user != null){
//            Address address = user.getAddress();
//            if(address != null){
//                return address.getProvince()==null? "unknown" : address.getProvince();
//            }else {
//                return "address is null.";
//            }
//        }else {
//            return "user is null.";
//        }
    }

    /**
     * Optional 的empty()方法的使用
     * @param user
     * @return
     */
    public static Optional<Object> getEmptyUser(User user) {
        return Optional.empty();
    }

    /**
     * Optional 的of(T value)方法的使用
     * @param user
     * @return
     */
    public static User getOfUser(User user){
        return Optional.of(user).get();
    }

    /**
     * Optional 的ofNullable(T value)方法的使用
     * @param user
     * @return
     */
    public static User getOfNullableUser(User user){
        return Optional.ofNullable(user).get();
    }

    public static String getUserName(User user) throws Exception {
        return Optional.ofNullable(user).map(user1 -> user1.getName()).orElseThrow(()->new Exception("不存在！"));
        /*
        public static Optional<String> getName(User user){
            return Optional.ofNullable(name);
        }
         */
//        return Optional.ofNullable(user).flatMap(user1 -> user.getName()).orElseThrow(()->new Exception("不存在！"));
    }

}
