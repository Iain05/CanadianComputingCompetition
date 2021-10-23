alphabet = "abcdefghijklmnopqrstuvwxyz"
vowel = ['a','e','i','o','u']
word = input()


for i in range(word.length()):
    if not any(word[i] in s for s in vowel):
        
