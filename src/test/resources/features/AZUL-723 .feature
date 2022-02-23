@AZUL-731
Feature: Default

	Background:
		#@AZUL-723
		Given the user is logged in
		When the user clicks "Company" button
		When the user clicks "ADD NEWS" button
		

	#{color:#57d9a3}*User Story:* {color}
	#
	#As a user, I should be able to add news under Company
	#
	#{color:#de350b}*Acceptance Criteria:*{color}
	# # {color:#172b4d}User should be able to select the type of information under preview text{color} 
	# # {color:#172b4d}User should be able to select a date and set a time under preview text{color}
	# # {color:#172b4d}User should be able to add and remove a picture under details{color}
	# # {color:#172b4d}User should be able to edit a picture under details{color}
	# # {color:#57d9a3}*User should be able to add tags under details*{color}
	# # User should be able to select Text, HTML, and Visual Editor
	# # User should be able to send news
	@AZUL-726 @AZUL-730 @news
	Scenario: Cucumber add tags
		And the user should be ablte to write some tags	

	#{color:#57d9a3}*User Story:* {color}
	#
	#As a user, I should be able to add news under Company
	#
	#{color:#de350b}*Acceptance Criteria:*{color}
	# # {color:#172b4d}User should be able to select the type of information under preview text{color} 
	# # {color:#172b4d}User should be able to select a date and set a time under preview text{color}
	# # *{color:#57d9a3}User should be able to add and remove a picture under details{color}*
	# # User should be able to edit a picture under details
	# # User should be able to add tags under details
	# # User should be able to select Text, HTML, and Visual Editor
	# # User should be able to send news
	@AZUL-724 @AZUL-730
	Scenario: Cucumber add picture and remove
		And the user click Details button
		Then User should able to add and remove a picture	

	#{color:#57d9a3}*User Story:* {color}
	#
	#As a user, I should be able to add news under Company
	#
	#{color:#de350b}*Acceptance Criteria:*{color}
	# # {color:#172b4d}User should be able to select the type of information under preview text{color} 
	# # User should be able to select a date and set a time under preview text
	# # User should be able to add and remove a picture under details
	# # User should be able to edit a picture under details
	# # User should be able to add tags under details
	# # {color:#57d9a3}*User should be able to select Text, HTML, and Visual Editor*{color}
	# # User should be able to send news
	@AZUL-728 @AZUL-730
	Scenario: Cucumber Select Text, HTML and Visial Editor
		Given the user should be clickable Text HTML Visual Editor buttons	

	#{color:#57d9a3}*User Story:* {color}
	#
	#As a user, I should be able to add news under Company
	#
	#{color:#de350b}*Acceptance Criteria:*{color}
	# # {color:#172b4d}User should be able to select the type of information under preview text{color} 
	# # User should be able to select a date and set a time under preview text
	# # User should be able to add and remove a picture under details
	# # User should be able to edit a picture under details
	# # User should be able to add tags under details
	# # {color:#172b4d}User should be able to select Text, HTML, and Visual Editor{color}
	# # {color:#57d9a3}*User should be able to send news*{color}
	@AZUL-729 @AZUL-730
	Scenario: Cucumber User send news
		And User should be able to click Save and add button