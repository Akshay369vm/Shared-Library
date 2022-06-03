def call () {
  sh "echo Hello World"
}
def addition(x,y) {
  sh 'echo $x "+" $y "=" $x+$y'
}
