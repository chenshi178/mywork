package com.work;

public class BankWater   {


    /**
     * 文件日期
     */
    private String fileDate;
    /**
     * 银行号
     */
    private String bank;
    /**
     * 电子账号
     */
    private String cardnbr;
    /**
     * 交易金额
     */
    private String amount;
    /**
     * 货币代码
     */
    private String curNum;
    /**
     * 交易金额符号
     */
    private String crflag;
    /**
     * 入帐日期
     */
    private String valdate;
    /**
     * 交易日期
     */
    private String inpdate;
    /**
     * 自然日期
     */
    private String reldate;
    /**
     * 交易时间
     */
    private String inptime;
    /**
     * 交易流水号
     */
    private String tranno;
    /**
     * 关联交易流水号
     */
    private String oriTranno;
    /**
     * 交易类型
     */
    private String transtype;
    /**
     * 交易描述
     */
    private String desline;
    /**
     * 交易后余额
     */
    private String currBal;
    /**
     * 对手交易帐号
     */
    private String forcardnbr;
    /**
     * 冲正、撤销标志
     */
    private String revind;
    /**
     * 交易标识
     */
    private String accchg;
    /**
     * 系统跟踪号
     */
    private String senno;
    /**
     * 原交易流水号
     */
    private String oriNum;
    /**
     * 保留域
     */
    private String resv;

    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardnbr() {
        return cardnbr;
    }

    public void setCardnbr(String cardnbr) {
        this.cardnbr = cardnbr;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurNum() {
        return curNum;
    }

    public void setCurNum(String curNum) {
        this.curNum = curNum;
    }

    public String getCrflag() {
        return crflag;
    }

    public void setCrflag(String crflag) {
        this.crflag = crflag;
    }

    public String getValdate() {
        return valdate;
    }

    public void setValdate(String valdate) {
        this.valdate = valdate;
    }

    public String getInpdate() {
        return inpdate;
    }

    public void setInpdate(String inpdate) {
        this.inpdate = inpdate;
    }

    public String getReldate() {
        return reldate;
    }

    public void setReldate(String reldate) {
        this.reldate = reldate;
    }

    public String getInptime() {
        return inptime;
    }

    public void setInptime(String inptime) {
        this.inptime = inptime;
    }

    public String getTranno() {
        return tranno;
    }

    public void setTranno(String tranno) {
        this.tranno = tranno;
    }

    public String getOriTranno() {
        return oriTranno;
    }

    public void setOriTranno(String oriTranno) {
        this.oriTranno = oriTranno;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getDesline() {
        return desline;
    }

    public void setDesline(String desline) {
        this.desline = desline;
    }

    public String getCurrBal() {
        return currBal;
    }

    public void setCurrBal(String currBal) {
        this.currBal = currBal;
    }

    public String getForcardnbr() {
        return forcardnbr;
    }

    public void setForcardnbr(String forcardnbr) {
        this.forcardnbr = forcardnbr;
    }

    public String getRevind() {
        return revind;
    }

    public void setRevind(String revind) {
        this.revind = revind;
    }

    public String getAccchg() {
        return accchg;
    }

    public void setAccchg(String accchg) {
        this.accchg = accchg;
    }

    public String getSenno() {
        return senno;
    }

    public void setSenno(String senno) {
        this.senno = senno;
    }

    public String getOriNum() {
        return oriNum;
    }

    public void setOriNum(String oriNum) {
        this.oriNum = oriNum;
    }

    public String getResv() {
        return resv;
    }

    public void setResv(String resv) {
        this.resv = resv;
    }


    @Override
    public String toString() {
        return super.toString() + "BankWater{" +
                "fileDate='" + fileDate + '\'' +
                ", bank='" + bank + '\'' +
                ", cardnbr='" + cardnbr + '\'' +
                ", amount='" + amount + '\'' +
                ", curNum='" + curNum + '\'' +
                ", crflag='" + crflag + '\'' +
                ", valdate='" + valdate + '\'' +
                ", inpdate='" + inpdate + '\'' +
                ", reldate='" + reldate + '\'' +
                ", inptime='" + inptime + '\'' +
                ", tranno='" + tranno + '\'' +
                ", oriTranno='" + oriTranno + '\'' +
                ", transtype='" + transtype + '\'' +
                ", desline='" + desline + '\'' +
                ", currBal='" + currBal + '\'' +
                ", forcardnbr='" + forcardnbr + '\'' +
                ", revind='" + revind + '\'' +
                ", accchg='" + accchg + '\'' +
                ", senno='" + senno + '\'' +
                ", oriNum='" + oriNum + '\'' +
                ", resv='" + resv + '\'' +
                '}';
    }
}