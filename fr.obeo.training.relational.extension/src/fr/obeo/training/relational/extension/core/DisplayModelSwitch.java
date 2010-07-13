/**
 * 
 */
package fr.obeo.training.relational.extension.core;

import fr.obeo.training.relational.iface.Column;
import fr.obeo.training.relational.iface.DataBase;
import fr.obeo.training.relational.iface.Field;
import fr.obeo.training.relational.iface.ForeignKey;
import fr.obeo.training.relational.iface.PrimaryKey;
import fr.obeo.training.relational.iface.Schema;
import fr.obeo.training.relational.iface.Table;
import fr.obeo.training.relational.util.RelationalSwitch;

/**
 * @author glefur
 *
 */
public class DisplayModelSwitch extends RelationalSwitch<String> {

	@Override
	public String caseDataBase(DataBase object) {
		String out = "Base : " + object.getUri() + ":" + object.getPort() + "\n";
		for (Schema schema : object.getSchemas()) {
			out += this.doSwitch(schema);
		}
		return out;
	}

	@Override
	public String caseColumn(Column object) {
		return "\t\t\t[Col] " + object.getName() + " : " + object.getType() + "\n";
	}

	@Override
	public String caseForeignKey(ForeignKey object) {
		return "\t\t\t[FK]  " + object.getName() + " -> " + object.getReference().getName() + "\n";
	}

	@Override
	public String casePrimaryKey(PrimaryKey object) {
		return "\t\t\t[PK]  " + object.getName() + "\n";
	}

	@Override
	public String caseSchema(Schema object) {
		String out = "\tSchemas : " + object.getName() + "\n";
		for (Table table : object.getTables()) {
			out += this.doSwitch(table);
		}
		return out;
	}

	@Override
	public String caseTable(Table object) {
		String out = "\t\tTable : " + object.getName() + "\n";
		for (Field field : object.getFields()) {
			out += this.doSwitch(field);
		}
		return out;
	}

}
