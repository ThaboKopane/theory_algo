import csv
try:
    import pandas as pd
    import numpy as np
    from pulp import *
except:
    from pip._internal import main
    main(['install', 'pandas', 'numpy', 'pulp'])
    import pandas as pd
    import numpy as np
    from pulp import *
#read the csv file
file = pd.read_csv('loans.csv')
maxy = 500000

#start a maximisation function
prob = LpProblem("max", LpMaximize)

#The variables
x1 = LpVariable("x_1", 0,1,cat="Binary")
x2 = LpVariable("x_2", 0,1,cat="Binary")
x3 = LpVariable("x_3", 0,1,cat="Binary")
x4 =LpVariable("x_4", 0,1,cat="Binary")
x5 =LpVariable("x_5", 0,1,cat="Binary")
x6 =LpVariable("x_6", 0,1,cat="Binary")
x7 =LpVariable("x_7", 0,1,cat="Binary")
x8 =LpVariable("x_8", 0,1,cat="Binary")
x9=LpVariable("x_9", 0,1,cat="Binary")
x10=LpVariable("x_10", 0,1,cat="Binary")
x11=LpVariable("x_11", 0,1,cat="Binary")
x12=LpVariable("x_12", 0,1,cat="Binary")
x13=LpVariable("x_13", 0,1,cat="Binary")
x14=LpVariable("x_14", 0,1,cat="Binary")
x15=LpVariable("x_15", 0,1,cat="Binary")
x16=LpVariable("x_16", 0,1,cat="Binary")
x17=LpVariable("x_17", 0,1,cat="Binary")
x18=LpVariable("x_18", 0,1,cat="Binary")
x19=LpVariable("x_19", 0,1,cat="Binary")
x20=LpVariable("x_20", 0,1,cat="Binary")
x21=LpVariable("x_21", 0,1,cat="Binary")
x22=LpVariable("x_22", 0,1,cat="Binary")
x23=LpVariable("x_23", 0,1,cat="Binary")
x24=LpVariable("x_24", 0,1,cat="Binary")
x25=LpVariable("x_25", 0,1,cat="Binary")
x26=LpVariable("x_26", 0,1,cat="Binary")
x27=LpVariable("x_27", 0,1,cat="Binary")
x28=LpVariable("x_28", 0,1,cat="Binary")
x29=LpVariable("x_29", 0,1,cat="Binary")
x30=LpVariable("x_30", 0,1,cat="Binary")

#the objective function 
prob += 9*x1+10*x2+11*x3+8*x4+7*x5+10*x6+11*x7+12*x8+9*x9+10*x10+11*x11+8*x12+7*x13+10*x14+11*x15+12*x16+10*x17+11*x18+8*x19+7*x20+10*x21+11*x22+12*x23+10*x24+11*x25+8*x26+7*x27+10*x28+11*x29+12*x30


#constraints  - part of the functio 
prob += 52100*x1+52200*x2+51200*x3+51000*x4+51900*x5+49700*x6+48600*x7+41200*x8+42000*x9+62000*x10+31200*x11+39200*x12+42000*x13+49800*x14+44700*x15+40900*x16+40200*x17+51300*x18+50100*x19+50200*x20+50400*x21+50500*x22+51200*x23+30200*x24+31300*x25+46100*x26+50200*x27+51100*x28+49300*x29+48600*x30 <= 500000

GLPK().solve(prob)

#create a list of id's for items that qualify
items = []
for v in prob.variables():
    #print(v.name, "=", v.varValue)
    if v.varValue ==1:
        items.append(v.name)

#price of maximised items
price_items =[]
#The combined experience
total_exp=0
col_names = ['id','loan amount', 'applicant experience']
final_loans = pd.DataFrame(columns=col_names)
for index, row in file.iterrows():
    for i in range(len(items)):
        if int(row['id']) == int(items[i].split('_')[1]):
            total_exp = total_exp+row['applicant_experience']
            price_items.append(row['loan_amount'])
            final_loans.loc[len(final_loans)] = [row['id'], row['loan_amount'], row['applicant_experience']]
final_loans.to_csv("maximum_experience_loans.csv", index=False)
#append thr total exp and total price
with open(r'maximum_experience_loans.csv','a') as fd:
    fd.write("total years of expereince : "+str(total_exp)+", ")
    fd.write("total​ ​amount : "+str(sum(price_items)))