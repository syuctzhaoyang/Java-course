# 什么是线程 #
## 线程的讲解 ##

2020年10月05日 10:02:19

2020年10月05日 10:02:04 

[http://www.baidu.com](http://www.baidu.com "百度")

[https://www.oracle.com/sun/](https://www.oracle.com/sun/)

	import numpy as np
	import matplotlib.pyplot as plt
	
	
	# network = {}
	# network['w1'] = np.array([[0.1, 0.3, 0.5], [0.2, 0.4, 0.6]])
	# network['b1'] = np.array([[0.1, 0.2, 0.3]])
	# network['w2'] = np.array([[0.1, 0.4], [0.2, 0.5], [0.3, 0.6]])
	# network['b2'] = np.array([[0.1, 0.2]])
	#
	#
	def sigmoid_function(x):
	    return 1. / (1 + np.exp((-x)))
	
	
	def softmax_function(x):
	    return np.exp(x) / np.sum(np.exp(x))
	
	
	def cross_entropy_err(y_hat, y):
	    delta = 1e-8
	    return -np.sum(y * np.log(y_hat + delta))
	
	
	def mean_squared_err(y_hat, y):
	    return 0.5 * np.sum((y_hat - y) ** 2)
