import pandas as pd

def meltTable(report: pd.DataFrame) -> pd.DataFrame:
    return pd.melt(
        report,
        id_vars=["id"],
        var_name="variable",
        value_name="value" 
    )
