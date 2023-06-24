

### PW CRACK 3 SOLUTION ! 

![1](https://github.com/boranakova/ctf/assets/56170942/132fe030-d3e0-43db-9656-3036231443ad)
<br></br>
>NOTE : First of all , download all files required for this level indicated on site.

![2](https://github.com/boranakova/ctf/assets/56170942/5124c3e3-ea9f-49c4-8f8d-dad978d70f68)
<br></br>
>NOTE : Before checking these files You should start with <b>.py</b> file for exploring functions and their processes.
> When I checked in detail, I found the hash function named <b>hash_pw()</b> The process of this function ; When the string encoding is finished the parameter
> given by user assigns to byte array. Then uses MD5 Hash Algorithm and their methods designed by hashlib library. 
<br></br>
![3](https://github.com/boranakova/ctf/assets/56170942/dd331ee5-ba88-439e-8626-568d12167e07)

>NOTE : For understand this output down below and finding the correct password  , we should use the process of hash_pw backwards.
<br></br>
![4](https://github.com/boranakova/ctf/assets/56170942/5ebceb4e-2092-47e8-8271-89fd69e844c8)

>NOTE : First of all we need to find the correct file editor for displaying the <b>.bin</b> file
<br></br>
```sh
bvi 
``` 
> will solve this problem. It will open like this
<br></br>
![5](https://github.com/boranakova/ctf/assets/56170942/89430592-ded6-47d1-857f-c0da8fc115fd)

> I used <b>hexdump</b> as well for displaying without complex outcomes.
<br></br>
![6](https://github.com/boranakova/ctf/assets/56170942/c5a64055-0097-499f-981a-d704e3eae4b4)

> Then I searched a decoder in website. When I found the correct one. I simply put my output from .bin file pasted in decoder.
> Generating the decoder gives the correct password.
<br></br>
![7](https://github.com/boranakova/ctf/assets/56170942/063e5099-62cd-4cf8-8913-0b158ae17287)

> Just entering the password will give us a flag.
<br></br>
![8](https://github.com/boranakova/ctf/assets/56170942/c2f8a942-6624-4fb4-bfae-5f759cea8603)









