funcionb :: Int -> Int
funcionb 0 = -1
funcionb 1 = 2
funcionb n = (funcionb(n-1)*funcionb(n-1))*funcionb(n-2)