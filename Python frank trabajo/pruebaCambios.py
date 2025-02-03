import tkinter as tk
from tkinter import messagebox



# Crear la ventana principal
ventana = tk.Tk()
ventana.title("Cálculo de HOMA-IR")
ventana.geometry("640x420")

# Etiquetas y campos de entrada
tk.Label(ventana, text="Insulina en ayunas (µU/mL):", font=("Arial", 12)).pack(pady=10)
entry_insulina = tk.Entry(ventana, font=("Arial", 12))
entry_insulina.pack(pady=5)

tk.Label(ventana, text="Glucosa en ayunas (mg/dL):", font=("Arial", 12)).pack(pady=10)
entry_glucosa = tk.Entry(ventana, font=("Arial", 12))
entry_glucosa.pack(pady=5)

# Botón para calcular
boton_calcular = tk.Button(ventana, text="Calcular HOMA-IR", font=("Arial", 12), command=calcular_homa_ir)
boton_calcular.pack(pady=20)

# Etiqueta para el resultado
resultado_label = tk.Label(ventana, text="", font=("Arial", 14), fg="blue")
resultado_label.pack(pady=10)

# Ejecutar la ventana
ventana.mainloop()