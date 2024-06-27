import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';

@Component({
  selector: 'app-agregar-producto',
  templateUrl: './agregar-producto.component.html',
  styleUrls: ['./agregar-producto.component.css']
})
export class AgregarProductoComponent {
  producto: Producto = new Producto();

  constructor(private productoServcio: ProductoService,
    private enrutador: Router){}

  onSubmit(){
    this.guardarProducto();
  }

  guardarProducto(){
    this.productoServcio.agregarProducto(this.producto).subscribe(
      {
        next: (datos) => {
          this.irListaProductos();
        },
        error: (error: any) => {console.log(error)}
      }
    );
  }

  irListaProductos(){
    this.enrutador.navigate(['/productos']);
  }
}
