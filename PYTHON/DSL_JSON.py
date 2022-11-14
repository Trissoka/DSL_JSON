import pandas as pd


def read(path):
    # Using DF
    JSON = pd.read_JSON(path)

    # Using JSON
    # JSON = json.load(JSON)
    return JSON


def write_JSON(JSON, path):
    # Using DF
    JSON.to_JSON(path)

    # Using JSON
    # JSON = json.dumb(JSON,path)

    return "done"

def write_CSV(JSON,path):
    # Using DF
    JSON.to_csv(path)
    return "done"

def Convert_JSON_TO_DF(JSON):
    JSON = pd.read_json(JSON, orient='index')
    return JSON

def count(JSON):
    return len(JSON)


if __name__ == '__main__':
    print("hello world")
