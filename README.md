## What is this
Check compatibility of URL encoding b/w different languages

## Support 
- Java
- javascript

## Sample
Suppose `sample.txt` contains all the character you are going to use.

The first example checks if js-encoded string can be decoded by Java correctly.

The second example checks if java-encoded string can be decoded by javascript correctly.


```
# Looks good.
$ diff <(cat sample.txt) <(cat sample.txt | node js/encoder.js | java -cp java Decoder)

# Looks bad.
$ diff <(cat sample.txt) <(cat sample.txt | java -cp java Encoder | node js/decoder.js)
1c1
< `~!@#$%^&*()-_=+[{]}\|;:'",<.>/? abcあいう
---
> `~!@#$%^&*()-_=+[{]}\|;:'",<.>/?+abcあいう
```