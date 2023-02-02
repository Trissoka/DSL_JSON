import pandas as pd
import json
df0 = pd.read_json("path_for_json_400_NI.json", orient="index")
print(df0.loc["color50"])
