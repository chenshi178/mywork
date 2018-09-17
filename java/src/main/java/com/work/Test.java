package com.work;

import java.io.*;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        try {
            File file = new File("d://3005-ALEVE0124-20180910");

            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");


            BufferedReader bufferedReader = new BufferedReader(isr);

            String fileContentLine = null;
            System.out.println("aaaaaaaaaaaaaa");
            int i = 0;
            while ((fileContentLine = bufferedReader.readLine()) != null) {

                if (fileContentLine.indexOf("P2P债权转让资金转入") > 0) {
                    i++;

                    BankWater bankWater = new BankWater();


                    bankWater.setBank(fileContentLine.substring(0, 4));
                    bankWater.setCardnbr(fileContentLine.substring(4, 23));
                    bankWater.setAmount(fileContentLine.substring(23, 40));
                    bankWater.setCurNum(fileContentLine.substring(40, 43));
                    bankWater.setCrflag(fileContentLine.substring(43, 44));

                    bankWater.setValdate(fileContentLine.substring(44, 52));

                    bankWater.setInpdate(fileContentLine.substring(52, 60));
                    bankWater.setReldate(fileContentLine.substring(60, 68));
                    bankWater.setInptime(fileContentLine.substring(68, 76));
                    bankWater.setTranno(fileContentLine.substring(76, 82));
                    bankWater.setOriTranno(fileContentLine.substring(82, 88));

                    bankWater.setTranstype(fileContentLine.substring(88, 92));


                    bankWater.setDesline(CutString.substring(fileContentLine, 134).substring(CutString.substring(fileContentLine, 92).length()));


                    bankWater.setCurrBal(CutString.substring(fileContentLine, 151).substring(CutString.substring(fileContentLine, 134).length()));


                    bankWater.setForcardnbr(CutString.substring(fileContentLine, 170).substring(CutString.substring(fileContentLine, 151).length()));


                    bankWater.setRevind(CutString.substring(fileContentLine, 171).substring(CutString.substring(fileContentLine, 170).length()));

                    bankWater.setAccchg(CutString.substring(fileContentLine, 172).substring(CutString.substring(fileContentLine, 171).length()));
                    bankWater.setSenno(CutString.substring(fileContentLine, 178).substring(CutString.substring(fileContentLine, 172).length()));
                    bankWater.setOriNum(CutString.substring(fileContentLine, 184).substring(CutString.substring(fileContentLine, 178).length()));
                    // bankWater.setResv(temp.substring(184, 371));


                    System.out.println(bankWater.toString());


                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
