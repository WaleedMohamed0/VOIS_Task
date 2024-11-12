import pandas as pd

df = pd.read_csv('Employees.csv')
df = df.drop_duplicates()

df['Age'] = df['Age'].astype(int)
exchangeRate = 49
df['Salary(USD)'] = df['Salary(USD)'] * exchangeRate
averageSalary = df['Salary(USD)'].mean()
medianSalary = df['Salary(USD)'].median()
gender_counts = df['Gender'].value_counts()
male_female_ratio = gender_counts['M'] / gender_counts['F']

print('Average Salary: ', averageSalary)
print('Median Salary: ', medianSalary)
print("Ration between males and female employees: ", male_female_ratio)

df.to_csv('ModifiedEmployees.csv', index=False)