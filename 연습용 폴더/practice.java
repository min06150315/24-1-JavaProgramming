public int diff21(int n) {
  int num = 0;
  
  if (n <= 21 || n >= 0){
    num = 21 - n;
    return num;
  }else if (n > 21){
      num  = (n - 21) * 2;
      return num;
  }else if (n < 0 || n >= -21){
      num = 21 + n;
      return num;
  }else {
      num = (21 + n) * (-2);
      return num;
  }
}
