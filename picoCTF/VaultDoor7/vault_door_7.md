

# PicoCTF \ VaultDoor7 \ Write-Up 

## Description
This vault uses an XOR encryption scheme.
<br></br>
![2](https://github.com/boranakova/ctf/assets/56170942/9d271e51-8a62-45e4-b9d7-9cff8670a5f7)



SOLUTION 


> Little bit of a theory : If we use XOR again with the output. We find the parameter of variable in the unknown equation.
> So I simply created the mechanism of XOR written with Java.

```java
for(int i=0;i<32;i++){
System.out.println(myBytes[i]^0x55);
}
```

> The output will look like this : 
<br></br>
![3](https://github.com/boranakova/ctf/assets/56170942/e09d2b26-5bcb-4921-ba57-921663446985)
<br></br>

> The only thing left we already do the process on past level called VaultDoor6. I searched a tool on web and found this site.
> When I put my output to the website , the password of the next level shown down below.

<br></br>

![4](https://github.com/boranakova/ctf/assets/56170942/2d978a68-789d-4cd3-917b-36ce94ee259e)
