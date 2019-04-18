```python

from hog_svm.Lion import Rect
# import hog_svm.Lion as Li

list1 = []
for i in range(4):
    list1.append(Rect(i, 4))

for i in range(len(list1)):
    print(list1[i].area())
```
