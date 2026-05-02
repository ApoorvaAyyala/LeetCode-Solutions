import requests

USERNAME = "https://leetcode.com/u/GV2025003230/"

def fetch_data():
    url = "https://leetcode-stats-api.herokuapp.com/" + USERNAME
    return requests.get(url).json()

def generate_markdown(data):
    return f"""
- Total Solved: {data['totalSolved']}
- Easy: {data['easySolved']}
- Medium: {data['mediumSolved']}
- Hard: {data['hardSolved']}
- Ranking: {data['ranking']}
"""

def update_readme(content):
    with open("README.md", "r") as f:
        readme = f.read()

    start = "<!-- LEETCODE-STATS-START -->"
    end = "<!-- LEETCODE-STATS-END -->"

    new_readme = readme.split(start)[0] + start + "\n" + content + "\n" + end + readme.split(end)[1]

    with open("README.md", "w") as f:
        f.write(new_readme)

if __name__ == "__main__":
    data = fetch_data()
    content = generate_markdown(data)
    update_readme(content)
