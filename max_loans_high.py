import csv

try:
    import pandas as pd
except:
    from pip._internal import main
    main(['install', 'pandas'])
    import pandas as pd

#reading the csv file
file = pd.read_csv('loans.csv')

start = 500000
total_used=0
count =0
potential_clients =[]
new_=[]
for index, row in file.iterrows():
        if row['applicant_experience'] >=10:
                potential_clients.append(row['loan_amount'])

sorting = sorted(potential_clients, reverse=True)



while (total_used < start):
        if total_used < start:
                total_used = total_used+sorting[count]
                new_.append(sorting[count])
        count = count+1

if sum(new_) > start:
        del new_[-1]
if sum(new_) + sorting[-1] <= start:
    new_.append(sorting[-1])

max_loans =len(new_)
total_made = sum(new_)

print("the list of loans that can be made" ,new_)

col_names = ['id','loan amount', 'applicant experience']
final_loans = pd.DataFrame(columns=col_names)
for index, row in file.iterrows():
    for i in range(len(new_)):
        if row['loan_amount'] == new_[i]:
            final_loans.loc[len(final_loans)] = [row['id'], row['loan_amount'], row['applicant_experience']]
final_loans.to_csv("maximum_number_loans.csv", index=False)

with open(r'maximum_number_loans.csv','a') as fd:
    fd.write("total​ ​number​ ​of​ ​loans : "+str(max_loans)+", ")
    fd.write("total​ ​amount : "+str(total_made))