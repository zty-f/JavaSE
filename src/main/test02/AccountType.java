package main.test02;

/**
 * @MethodName:
 * @Param null
 * @Return
 * @Exception
 * @author: zty-f
 * @date:  2022-05-06 20:20
 * @Description: 枚举测试
 * **/
enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
class EnumOne
{
    public static void main(String[]args)
    {
        System.out.println(AccountType.FIXED);//当调用枚举时会调用枚举类的构造方法，有多少个枚举构造方法就执行多少次！
        //打印
        /*
        It is a account type
        It is a account type
        It is a account type
        FIXED
         */

        // 且只用初始化一次，后续调用枚举则不做处理
        System.out.println(AccountType.CURRENT); //CURRENT
    }
}

	

