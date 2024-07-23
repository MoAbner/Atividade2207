import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "cliente")
public class Cliente
{   
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String nomeCompleto;
    
    @DatabaseField
    public int registro;
    
    @DatabaseField(dataType=DataType.DATE)
    public Date dataNascimento;    
    
    public String printDataNascimento() {
        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
        return dateFor.format(dataNascimento);
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie id*/
    public int getId(){
        return this.id;
    }//end method getId

    /**SET Method Propertie id*/
    public void setId(int id){
        this.id = id;
    }//end method setId

    /**GET Method Propertie nomeCompleto*/
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }//end method getNomeCompleto

    /**SET Method Propertie nomeCompleto*/
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }//end method setNomeCompleto

    /**GET Method Propertie registro*/
    public int getRegistro(){
        return this.registro;
    }//end method getRegistro

    /**SET Method Propertie registro*/
    public void setRegistro(int registro){
        this.registro = registro;
    }//end method setRegistro

    /**GET Method Propertie dataNascimento*/
    public Date getDataNascimento(){
        return this.dataNascimento;
    }//end method getDataNascimento

    /**SET Method Propertie dataNascimento*/
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }//end method setDataNascimento

//End GetterSetterExtension Source Code


}
