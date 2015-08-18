 # design a tiny URL or URL shortener
import sys;

# Algorithm
# 1. place the long url in db table with unique rowid
# 2. since rowid is unique for each entry lets design function to generate short_url from row_id 
# and another function to get back the row_id from the short_url

# convert rowid to short url
def id_to_short_url(db_id):
	# we are defining the letters in short url to be one of the following: a-z, A-Z. 0-9;
	# A URL character can be one of the following
	# 1) A lower case alphabet [‘a’ to ‘z’], total 26 characters
	# 2) An upper case alphabet [‘A’ to ‘Z’], total 26 characters
	# 3) A digit [‘0′ to ‘9’], total 10 characters
	
	# There are total 26 + 26 + 10 = 62 possible characters.
	
	# So the task is to convert a decimal number to base 62 number.
	
	# To get the original long url, we need to get url id in database. The id can be obtained using base 62 to decimal conversion.
	# Map to store 62 possible characters
	map = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQUSTUVWXYZ0123456789'
	short_url = ''
	
	#Convert given integer id to a base 62 number
	while(db_id != 0):
		index = db_id % 62
		short_url += map[index]
		db_id = db_id / 62
		
	# Reverse shortURL to complete base conversion
	short_url = short_url[::-1]
	
	return short_url

# Function to get integer ID back from a short url
def short_url_to_id(short_url):
	db_id = 0;
	
	# A simple base conversion logic
	for letter in short_url:
		if(letter >= 'a' and letter <= 'z'):
			db_id = db_id * 62 + ord(letter) - ord('a')
		if(letter >= 'A' and letter <= 'Z'):
			db_id = db_id * 62 + ord(letter) - ord('A') + 26 #adding values to match it with the map string
		if(letter >= '0' and letter <= '9'):
			db_id = db_id * 62 + ord(letter) - ord('0') + 52
	return db_id

def main(arg):
	long_url = arg
	# place the long url in the DB and
	# get the row id from the table
	# let us assume that the row id is 12345
	row_id = 12345
	print "row id is {0}".format(row_id)
	short_url = id_to_short_url(row_id)
	print "short_url is {0}".format(short_url);
	print "db_id is {0}".format(short_url_to_id(short_url))

if __name__ == "__main__":
    main(sys.argv[1:])


		
