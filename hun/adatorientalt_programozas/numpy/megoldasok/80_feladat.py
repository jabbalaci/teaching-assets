import numpy as np

from fifa_players import np_heights, np_positions

# print(np_positions.shape)
# print(np_heights.shape)

# Heights of the goalkeepers: gk_heights
gk_heights = np_heights[np_positions == "GK"]

# Heights of the other players: other_heights
other_heights = np_heights[np_positions != "GK"]
print(len(gk_heights), len(other_heights))

# Print out the median height of goalkeepers. Replace 'None'
print("Median height of goalkeepers:", np.median(gk_heights))

# Print out the median height of other players. Replace 'None'
print("Median height of other players:", np.median(other_heights))
