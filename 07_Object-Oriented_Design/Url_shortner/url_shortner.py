 # design a tiny URL or URL shortener
import sys;

# Algorithm
# 1. place the long url in db table
# 2. get the rowid from the table and convert it into short url (id_to_short_url)
# 3. convert back the short url into rowid and get the long url (short_url_to_id)

# change the rowid to short url
def id_to_short_url(db_id):
	# a to z = 26
	# A to Z = 26
	# 0 to 9 = 10
	# total there are 62 possible letters
	map = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQUSTUVWXYZ0123456789'
	short_url = ''
	while(db_id != 0):
		index = db_id % 62
		short_url += map[index]
		db_id = db_id / 62
	return short_url

# change the short url to row id
def short_url_to_id(short_url):
	db_id = 0;
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
	short_url = short_url[::-1]	# reverse it to calculate the id from the starting
	print "short_url is {0}".format(short_url);
	print "db_id is {0}".format(short_url_to_id(short_url))

if __name__ == "__main__":
    main(sys.argv[1:])


		
