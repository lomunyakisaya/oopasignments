import time
myarray = list(range(10000000))
target = 9999999
start_time = time.perf_counter()
for i in range(len(myarray)):
    if target == myarray[i]:
        end_time = time.perf_counter()
        duration = end_time - start_time
        print("Found!")
        print("Element is present at index", str(i), "took me ", duration, "seconds")
        break
else:
    print("Not Fouind!")
#lear search took approximately 1.5424 s O(n) time complexity