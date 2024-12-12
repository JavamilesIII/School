def how_should_I_get_there(miles):
	if miles > 120.0:
		print('Take a plane')
	elif miles >= 2.0:
		print('Take a car')
	else:
		print('Walk')
x = float(input('How many miles? '))
how_should_I_get_there(x)