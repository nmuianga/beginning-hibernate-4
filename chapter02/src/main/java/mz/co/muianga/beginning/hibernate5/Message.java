/**
 * 
 */
package mz.co.muianga.beginning.hibernate5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Nilvandro Muianga, Sep 27, 2019 7:39:33 AM
 *
 */
@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(nullable = false)
	String text;
	
	public Message(String text) {
		setText(text);
	}
	
	public Message() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Message{" +
				"id=" + getId() +
				", text='" + getText() + '\'' +
				'}';
	}

}
