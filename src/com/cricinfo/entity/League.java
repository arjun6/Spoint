/**
 * 
 */
package com.cricinfo.entity;

/**
 * @author I340660
 *
 */
public class League {

	    private String id;
		private String name; 
		private String formatId;
		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the formatId
		 */
		public String getFormatId() {
			return formatId;
		}
		/**
		 * @param formatId the formatId to set
		 */
		public void setFormatId(String formatId) {
			this.formatId = formatId;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "League [id=" + id + ", name=" + name + ", formatId=" + formatId + "]";
		}
	

}
