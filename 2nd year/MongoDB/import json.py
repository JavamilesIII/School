import json

# Define the number of entries
num_entries = 10000000

# Generate sample data
data = [{"_id":f"{i}","Katergorie": f"Kategorie_{i}", "Preis": 0.01*i+100 } for i in range(num_entries)]

# Define the file path
file_path = '/Users/loicm/Downloads/milliard.json'

# Write the data to a JSON file
with open(file_path, 'w') as json_file:
    json.dump(data, json_file)

file_path