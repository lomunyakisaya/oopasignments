import time
def binarySearch(myarray, low, high, target):
    if (low > high):
        return -1
    middle = low + (high - low) // 2
    if myarray[middle] == target:
        return middle
    elif myarray[middle]  > target:
        return binarySearch(myarray, low, middle-1, target)
    else:
        return binarySearch(myarray, middle + 1, high, target)
if __name__ == "__main__":
    myarray = list(range(10000000))
    high = len(myarray) - 1
    low = 0
    target = 9999999
    start_time = time.perf_counter()
    result = binarySearch(myarray, low, high, target)
    end_time = time.perf_counter()
    duration = end_time - start_time

    if result != -1:
        print("Found!")
        print("Element is present at index", str(result), "took me ", duration, "seconds")
    else:
        print("Not Found!")
#binary search took approximately 0.0000632 s O(log n) time complexity