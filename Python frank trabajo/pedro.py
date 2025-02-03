
import tkinter as tk
from tkinter import messagebox

def check_insulin_level():
    try:
        insulin_level = float(entry_insulin.get())
        if insulin_level > 120:  # Umbral para niveles altos (puedes ajustarlo según necesidad)
            lbl_status.config(text="¡Alerta! Nivel de insulina alto", fg="red")
            messagebox.showwarning("Advertencia", "Los niveles de insulina son peligrosos. ¡Actúe de inmediato!")
        else:
            lbl_status.config(text="Nivel de insulina normal", fg="green")
    except ValueError:
        messagebox.showerror("Error", "Por favor, ingrese un valor numérico válido.")

def close_app():
    root.destroy()

# Configuración de la ventana principal
root = tk.Tk()
root.title("Alarma de Insulina")
root.geometry("640x420")
root.resizable(False, False)

# Etiqueta de título
lbl_title = tk.Label(root, text="Monitor de Insulina", font=("Arial", 16))
lbl_title.pack(pady=10)

# Entrada de nivel de insulina
frame_input = tk.Frame(root)
frame_input.pack(pady=20)

lbl_insulin = tk.Label(frame_input, text="Nivel de insulina (mg/dL):", font=("Arial", 12))
lbl_insulin.grid(row=0, column=0, padx=5, pady=5)

entry_insulin = tk.Entry(frame_input, font=("Arial", 12), width=10)
entry_insulin.grid(row=0, column=1, padx=5, pady=5)

# Botón para verificar niveles
btn_check = tk.Button(root, text="Verificar Nivel", font=("Arial", 12), command=check_insulin_level)
btn_check.pack(pady=10)

# Etiqueta para estado
lbl_status = tk.Label(root, text="", font=("Arial", 12))
lbl_status.pack(pady=10)

# Botón para cerrar la aplicación
btn_exit = tk.Button(root, text="Salir", font=("Arial", 12), command=close_app)
btn_exit.pack(pady=10)

# Bucle principal de la aplicación
root.mainloop()



# Función para calcular HOMA-IR
def calcular_homa_ir():
    try:
        insulina = float(entry_insulina.get())
        glucosa = float(entry_glucosa.get())
        homa_ir = (insulina * glucosa) / 405
        resultado_label.config(text=f"HOMA-IR: {homa_ir:.2f}")
        
        # Mostrar interpretación básica
        if homa_ir < 1.9:
            interpretacion = "Resistencia a la insulina baja."
        elif 1.9 <= homa_ir <= 2.9:
            interpretacion = "Resistencia a la insulina moderada."
        else:
            interpretacion = "Resistencia a la insulina alta."
        
        messagebox.showinfo("Interpretación", interpretacion)
    except ValueError:
        messagebox.showerror("Error", "Por favor, ingrese valores numéricos válidos.")





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