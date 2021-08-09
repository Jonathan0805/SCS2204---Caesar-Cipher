object Caesar_Cipher extends App{

  val encrypt = (c:Char,key:Int,a:String) => {
    a((a.indexOf(c.toUpper)+key) % a.size)
  }

  val decrypt = (c:Char,key:Int,a:String) => {
    a((a.indexOf(c.toUpper)-key) % a.size)
  }

  val cipher = (alg:(Char,Int,String) => Char,text:String,key:Int,a:String) => text.map(alg(_,key,a))


  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  var plaintext = "THENAMEISBOND"

  val ept = cipher(encrypt,plaintext,3,alphabet)
  val dpt = cipher(decrypt,ept,3,alphabet)

  println("Text     : " + plaintext + "\n")
  println("Encrypted: " + ept)
  println("Decrypted: " + dpt)

}