fun main () {
    val amount = 9999
    val minTransferFee = 35
    val transferFee = (amount.toDouble() / 100)*0.75
    if (transferFee <= minTransferFee){
        print(minTransferFee)
    }else {
        print(transferFee.toInt())
        }

}