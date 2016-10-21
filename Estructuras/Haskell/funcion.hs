funcion :: Int -> Int
funcion 0 = -1
funcion 1 = 2
funcion n = funcion(n-1)+(3*funcion(n-2))
