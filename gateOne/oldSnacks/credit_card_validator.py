def card():
	card_number = input("        Hello, Kindly Enter Card Details to verify       "+"\n")

	if not card_number:
		print("Invalid card number")

	if not card_number.isdigit():
		print("Invalid card number")
	else:
		array = [int(digit) for digit in card_number]
	
	print(f"Credit Card type: {card_type(card_number)}")
	print(f"Credit Card Number: {card_number}")
	print(f"Credit Card Validity: {card_validity(array)}")
	print(f"Credit Card Length: {card_length(array)}")
	print("THANK YOU")


def card_type(card_number):
	if card_number.startswith("4"):
		return "Visa Card"
	elif card_number.startswith("5"):
		return "Master Card"
	elif card_number.startswith("37"):
		return "AmericanExpress Cards"
	elif card_number.startswith("6"):
		return "Discover Cards"
	else:
		return "INVALID CARD"


def card_validity(array):
	sum_even = 0
	sum_odd = 0
	
	for count in range(len(array)):
		if count % 2 == 0:
			num = array[count] * 2
			if array[count] < 5:
				sum_even += num
			else:
				digit = num % 10
				digit2 = num / 10
				pre_sum = digit + digit2
				sum += pre_sum
		else:
			sum_odd += array[count]	

		if (sum_even + sum_odd) % 10 == 0:
			return "VALID"
		else:
			return "INVALID"


def card_length(array):
	return len(array)
card()

