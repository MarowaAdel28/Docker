# Use the official Tomcat 9 image as the base image
FROM tomcat:9

# Set the working directory to the Tomcat webapps directory
WORKDIR /usr/local/tomcat/webapps/

# Copy the WAR file built by Maven to the webapps directory
COPY target/form.war .

# Expose port 8080 for incoming HTTP traffic
EXPOSE 8080

# Start Tomcat and deploy the WAR file
CMD ["catalina.sh", "run"]
